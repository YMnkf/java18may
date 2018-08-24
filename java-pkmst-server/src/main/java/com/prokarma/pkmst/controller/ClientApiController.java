package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ClientCard;
import org.threeten.bp.LocalDate;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2018-08-18T07:07:33.250Z")


@Controller
public class ClientApiController implements ClientApi {
    private final ObjectMapper objectMapper;
    @Autowired //Подключение к БД
    private JdbcTemplate jdbcTemplate; // Добавили поле класса

    public ClientApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> addClientCard(
        @ApiParam(value = "ClientCard that needs to be added" ,required=true )   @RequestBody ClientCard body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<ClientCard>> findClientCardByClientCriteria(@ApiParam(value = "", required = true)  @RequestParam(value = "Name", required = true) String name,
        @ApiParam(value = "", required = true)  @RequestParam(value = "Surname", required = true) String surname,
        @ApiParam(value = "")  @RequestParam(value = "ParentName", required = false) String parentName,
        @ApiParam(value = "", allowableValues = "Passport, Foreign passport, Seaman passport")  @RequestParam(value = "TypeDoc", required = false) String typeDoc,
        @ApiParam(value = "")  @RequestParam(value = "SeriaDoc", required = false) String seriaDoc,
        @ApiParam(value = "")  @RequestParam(value = "NumDoc", required = false) String numDoc,
        @ApiParam(value = "")  @RequestParam(value = "Issuer", required = false) String issuer,
        @ApiParam(value = "")  @RequestParam(value = "IssueDate", required = false) LocalDate issueDate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/xml")) {
            return new ResponseEntity<List<ClientCard>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<ClientCard>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<ClientCard>>(HttpStatus.OK);
    }

    public ResponseEntity<ClientCard> getClientCardById(@ApiParam(value = "ID of ClientCard to return",required=true ) @PathVariable("ClientCardId") Long clientCardId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        string docTypeQuery = "select " + //24.08.2018
                "DocTypeID" +
                ", DocName" +
                " FROM DocTypes";
        List<Map<String, Object>> docTypes = jdbcTemplate.queryForList(docTypeQuery);
        Map<String,String> doctypesMap = new HashMap<>();
        for (Map<String, Object> row: docTypes) {
            String id = (String)row.get("DocTypeId");
            String Name = (String) row.get("DocName");
            doctypesMap.put(id,name);
        }
        
        string persoDocQuery = "select " +
                "PersonDocID" +
                ", ClientCardID" +
                " , DocTypeID" +
                " , SeriaDoc" +
                " , NumDoc" +
                " , Issuer" +
                " , IssueDate" +
                " FROM PersonDoc" +
                " WHERE ClientCardID = ?;";
        Object[] args = new Object[] { clientCardID };
        List<Map<String,Object>> rows = jdbcTemplate.queryForList(personDocQuery, args);
        List<PersonDoc> docs = new ArrayList<>(); //Объект типа List<PersonDoc>
        
        for (Map<String, Object> row: rows) {
            PersonDoc doc = new PersonDoc();
            Object idObj = row.get("PersonDocId"); // преобразование данных
            String idStr = (String) idObj;
            Long id = Long.ParseLong(idstr);
            doc.setId(id);
            
            String docTypeId = (String) row.get("DocTypeId");
            String docTypeName = doctypesMap.get(docTypeId);
            PersonDoc.TypeDocEnum type = PersonDoc.TypeDocEnum.fromValue(docTypeName);
            doc.setTypeDoc(type);
            
            Long seriaDoc = Long.parseLong((String) row.get("SeriaDoc")));
            doc.setSeriaDoc(seriaDoc);
            docs.add(doc);
        }
           
        clientCard = new clientCard();
        for (PersonDoc doc: docs) {
            card.addPersonDocItems(doc);
        }
        
        //выполняем запрос к БД
        //обрабатывам результат по аналогии с PersonDoc
        
        return new ResponseEntity<ClientCard> (card, HttpStatus.OK); // 24.08.2018
        

        //if (accept != null && accept.contains("application/xml")) {
        //    return new ResponseEntity<ClientCard>(objectMapper.readValue("", ClientCard.class), HttpStatus.OK);
        //}


        //if (accept != null && accept.contains("application/json")) {
        //    return new ResponseEntity<ClientCard>(objectMapper.readValue("", ClientCard.class), HttpStatus.OK);
        //}

        //return new ResponseEntity<ClientCard>(HttpStatus.OK);
    }

}
