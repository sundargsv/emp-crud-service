package com.sundar.employee.api;

import com.sundar.employee.commons.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sundar Gsv
 * @Date 08/11/18
 * @ClassDescription
 */
@RestController
@RequestMapping(path = {Constants.API_BASE_MOCK_CONTEXT_PATH},produces = {MediaType.APPLICATION_JSON_VALUE})
@Slf4j
public class MockApi {

    @CrossOrigin
    @GetMapping
    public List<String> getParticipants(){
        List<String> participants = new ArrayList<>();
        participants.add("BMA Reinsurance");
        participants.add("CNA Re Smart fac");
        participants.add("Evergreen Re");
        participants.add("General Colognal Re");
        participants.add("Global Reinsurance");;participants.add("Masherq");
        participants.add("GMAC Re");participants.add("Hannover Re");participants.add("Max Re");participants.add("Emirates NBD");participants.add("TATQ");participants.add("EMMAR");
        log.info("Getting list participants....");

        return participants;
    }
}
