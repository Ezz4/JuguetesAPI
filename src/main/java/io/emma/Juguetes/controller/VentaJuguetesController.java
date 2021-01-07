package io.emma.Juguetes.controller;

import io.emma.Juguetes.model.Juguete;
import io.emma.Juguetes.repository.JugueteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/venta_juguetes")
public class VentaJuguetesController {

    @Autowired //Inyecto dependencia
    private JugueteDao jugueteDao;

    @GetMapping
    public List<Juguete> getAll(){
        return jugueteDao.findAll();
    }

    @PostMapping("/guardar")
    public String guardarJuguete (@RequestBody Juguete juguete){
        jugueteDao.save(juguete);
        return  "succes";
    }

}
