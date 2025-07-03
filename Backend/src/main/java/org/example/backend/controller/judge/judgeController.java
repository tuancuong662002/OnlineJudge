package org.example.backend.controller.judge;


import org.example.backend.dto.Judge0Request;
import org.example.backend.entity.Submission;
import org.example.backend.service.Judge0Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/submit")
public class judgeController {
     @Autowired
     Judge0Service  judge0Service;
     @PostMapping
     public String handleJudgeCode(@RequestBody Submission submission){
          System.out.println(">>> source  code : "  + submission.getSourceCode() );
          String rs = judge0Service.submitCode( "console.log('hello')" , "hello" ) ;
          System.out.println(">>> source  code : "  + rs );
          return  rs ;
     }
     @GetMapping
     public String index(){

          return  "hello" ;
     }

}
