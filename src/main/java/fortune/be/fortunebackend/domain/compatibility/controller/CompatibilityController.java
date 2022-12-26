package fortune.be.fortunebackend.domain.compatibility.controller;

import fortune.be.fortunebackend.domain.compatibility.dto.request.CompatibilityRequest;
import fortune.be.fortunebackend.domain.compatibility.dto.response.CompatibilityResponse;
import fortune.be.fortunebackend.domain.compatibility.service.CompatibilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/compatibility")
public class CompatibilityController {
    private final CompatibilityService compatibilityService;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody CompatibilityRequest compatibilityDto){
        compatibilityService.saveCompatibility(compatibilityDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/info/{randomValue}")
    public ResponseEntity<CompatibilityResponse> memberInfo(@PathVariable String randomValue){
        CompatibilityResponse compatibilityResponse = compatibilityService.findInfo(randomValue);
        return new ResponseEntity<>(compatibilityResponse, HttpStatus.OK);
    }
}
