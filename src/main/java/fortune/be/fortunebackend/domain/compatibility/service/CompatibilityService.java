package fortune.be.fortunebackend.domain.compatibility.service;

import fortune.be.fortunebackend.domain.compatibility.dto.request.CompatibilityRequest;
import fortune.be.fortunebackend.domain.compatibility.dto.response.CompatibilityResponse;

public interface CompatibilityService {

    void saveCompatibility(CompatibilityRequest compatibilityDto);

    CompatibilityResponse findInfo(String randomValue);
}
