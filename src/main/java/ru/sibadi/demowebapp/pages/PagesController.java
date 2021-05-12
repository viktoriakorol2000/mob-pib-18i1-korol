package ru.sibadi.demowebapp.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sibadi.demowebapp.domain.Payment;
import ru.sibadi.demowebapp.domain.Person;
import ru.sibadi.demowebapp.repository.PersonRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@Controller
public class PagesController {

    private final Random rnd = new Random();
    private final PersonRepository personRepository;

    public PagesController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("persons", personRepository.findAllPersons());
        return "index";
    }

    @GetMapping("/person/{id}")
    public String personPage(
            @PathVariable("id") int id,
            Model model
    ) {
        model.addAttribute("person", personRepository.findPersonById(id));
        return "person";
    }

    @GetMapping("/person/{id}/payment")
    public String paymentPage(
            @PathVariable("id") int id,
            Model model
    ) {
        Person person = personRepository.findPersonById(id);
        model.addAttribute("person", person);
        model.addAttribute("payments", person.getPayments());
        return "payment";
    }

    @GetMapping("/person/{id}/payment/delete")
    public String deletePayment(
            @PathVariable("id") int id,
            @RequestParam("date") String date
    ){
        Person person = personRepository.findPersonById(id);
        person.deletePaymentByDate(LocalDate.parse(date));
        return "redirect:/person/" + id + "/payment";
    }

    @PostMapping("/person/{id}/payment")
    public String createPayment(
            @PathVariable("id") int id,
            @RequestParam("insSalary") int insSalary,
            @RequestParam("date") String date
    ){

        Payment payment = new Payment(LocalDate.parse(date), insSalary);
        Person person = personRepository.findPersonById(id);
        person.addPayment(payment);
        return "redirect:/person/" + id + "/payment";
    }

    @PostMapping("/person/{id}")
    public String editPerson(
            @PathVariable("id") int id,
            @RequestParam("name") String name,
            @RequestParam("salary") int salary

    ){
        Person person = personRepository.findPersonById(id);
        person.setName(name);
        person.setSalary(salary);
        return "redirect:/person/" + id;
    }
}