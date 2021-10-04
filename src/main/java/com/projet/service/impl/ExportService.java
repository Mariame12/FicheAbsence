package com.projet.service.impl;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import java.util.List;

//import javax.servlet.http.HttpServletResponse;

import com.projet.domain.FichePresence;
/*import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;


import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;*/
import com.projet.repository.FichePresenceRepository;
import java.util.List;
//import com.opencsv.CSVWriter;
//import com.opencsv.bean.ColumnPositionMappingStrategy;
//import com.opencsv.bean.StatefulBeanToCsv;
//import com.opencsv.bean.StatefulBeanToCsvBuilder;
//import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class ExportService {

    private final FichePresenceRepository fchrep;

    public ExportService(FichePresenceRepository fchrep) {
        super();
        this.fchrep = fchrep;
    }

    public List<FichePresence> ExportFiche() {
        return fchrep.findAll();
    }
}
