package fortune.be.fortunebackend.domain.fortune.controller;

import fortune.be.fortunebackend.domain.fortune.dto.request.FortuneRequest;
import fortune.be.fortunebackend.domain.fortune.dto.response.FortuneResponse;
import fortune.be.fortunebackend.domain.fortune.service.FortuneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fortune")
@RequiredArgsConstructor
public class FortuneController {

    private final FortuneService fortuneService;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody FortuneRequest fortuneRequest){
        fortuneService.saveFortune(fortuneRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/info/{randomValue}")
    public ResponseEntity<FortuneResponse> memberInfo(@PathVariable String randomValue){
        FortuneResponse fortuneResponse = fortuneService.findInfo(randomValue);
        return new ResponseEntity<>(fortuneResponse, HttpStatus.OK);
    }
}
