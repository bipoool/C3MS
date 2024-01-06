package com.example.c3ms.Controllers;

import com.example.c3ms.Models.TerraformConfiguration.TerraformConfigurations;
import com.example.c3ms.Repositories.TerraformConfigurationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("tc")
@RestController
public class TerraformConfigurationController {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    private TerraformConfigurationRepo terraformConfigurationRepo;

    @GetMapping("/getAll")
    public List<TerraformConfigurations> getAllUser() {
        return terraformConfigurationRepo.findAll();
    }

}
