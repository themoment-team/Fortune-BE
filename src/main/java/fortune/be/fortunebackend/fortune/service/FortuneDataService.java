package fortune.be.fortunebackend.fortune.service;

import fortune.be.fortunebackend.fortune.dto.FortuneDataDto;
import fortune.be.fortunebackend.fortune.entity.FortuneData;
import fortune.be.fortunebackend.fortune.repository.FortuneDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FortuneDataService {
    @Autowired
    private final FortuneDataRepository makeFortuneRepository;

    public FortuneDataService(FortuneDataRepository makeFortuneRepository) {
        this.makeFortuneRepository = makeFortuneRepository;
    }

    public FortuneData save(FortuneDataDto reqFortuneData){
        FortuneData fortuneData = reqFortuneData.makeFortuneEntity();
        return makeFortuneRepository.save(fortuneData);
    }

    public List<FortuneData> randomFortune(){
        return makeFortuneRepository.findAll();
    }
}
