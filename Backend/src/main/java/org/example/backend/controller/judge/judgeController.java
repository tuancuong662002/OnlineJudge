package org.example.backend.controller.judge;


import org.example.backend.dto.Judge0Request;
import org.example.backend.dto.SubmissionDTO;
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
     public String handleJudgeCode(@RequestBody SubmissionDTO submission){
          System.out.println(">>> source  code : "  + submission.getSourceCode() );
          int language_id   =  submission.getLanguageId() ;
          String source_code =  submission.getSourceCode();
          String token = judge0Service.submitCode(language_id ,  source_code , "1 2" ) ;
          String result = judge0Service.getSubmissResult(token) ;
          System.out.println(">>> source  code : "  + result );
          return  result ;
     }
     @GetMapping
     public String index(){
          return  "hello" ;
     }

}
