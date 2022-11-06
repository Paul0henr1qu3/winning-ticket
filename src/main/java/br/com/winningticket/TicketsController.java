package br.com.winningticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketsController {

    @GetMapping(value="/winner-ticket")
    public WinningTicket getLuckyTicket(){
        return new WinningTicket();
    }

}
