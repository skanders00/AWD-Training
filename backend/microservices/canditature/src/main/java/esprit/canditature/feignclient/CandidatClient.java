package esprit.canditature.feignclient;

import esprit.canditature.dto.Candidat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="CANDIDAT")
public interface CandidatClient {
    @RequestMapping("/mic1/candidats/{id}")
    public Candidat getCandidat(@PathVariable int id);
}
