package esprit.canditature;
import esprit.canditature.dto.Candidat;
import esprit.canditature.dto.Job;
import esprit.canditature.entity.Candidature;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mic3/candidature")
public class CandidatureRestApi {

    @GetMapping ("/hello")
    public String sayHello() {

        return "Hello Im microservice 3!";
    }
    @Autowired
    private CandidatureService candidatureService;


    @RequestMapping("/jobs")
    public List<Job> getAllJobs() {
        return candidatureService.getJobs();
    }

    @RequestMapping("jobs/{id}")
    public Job getJobById(@PathVariable int id) {
        return candidatureService.getJobById(id);
    }
    // Le reste des ressources liées à l’API Candidature

    @RequestMapping("candidats/{id}")
    public Candidat getCandidatById(@PathVariable int id) {
        return candidatureService.getCandidatById(id);
    }
    // Le reste des ressources liées à l’API Candidature
    @PostMapping
    public Candidature createCandidat(@RequestBody Candidature candidature) {
        return candidatureService.addCandidature(candidature);
    }


    // Le reste des ressources liées à l’API Candidature
//    @PostMapping
//    public Response createCandidat(@RequestBody Candidature candidature) {
//        return candidatureService.addCandidature(candidature);
//    }
}
