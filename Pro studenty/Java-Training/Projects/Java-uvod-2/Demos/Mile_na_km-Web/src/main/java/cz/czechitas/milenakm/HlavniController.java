package cz.czechitas.milenakm;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import net.sevecek.util.*;

@Controller
public class HlavniController {

    @RequestMapping(value = "/prevod", consumes = "text/plain", produces = "text/plain")
    @ResponseBody
    public String provedPrevod(@RequestBody String mileText) {
        var prevodnikCisel = new DoubleFormatter("0.##");

        var mile = prevodnikCisel.parse(mileText);
        var km = mile * 1.609344;
        var kmText = prevodnikNaCislo.print(km);

        return kmText;
    }

}
