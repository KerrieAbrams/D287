package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count()==0) {
            OutsourcedPart switches = new OutsourcedPart();
            switches.setCompanyName("Just Switches");
            switches.setName("Switches x100");
            switches.setInv(900);
            switches.setPrice(50.0);
            switches.setId(158);
            outsourcedPartRepository.save(switches);

            OutsourcedPart keycaps = new OutsourcedPart();
            keycaps.setCompanyName("Just Keycaps");
            keycaps.setName("Keycaps");
            keycaps.setInv(500);
            keycaps.setPrice(45.00);
            keycaps.setId(159);
            outsourcedPartRepository.save(keycaps);

            InhousePart plate = new InhousePart();
            plate.setName("Plate");
            plate.setPartId(160);
            plate.setInv(500);
            plate.setPrice(20.0);
            partRepository.save(plate);

            InhousePart keyboardCase = new InhousePart();
            keyboardCase.setName("Case");
            keyboardCase.setPartId(161);
            keyboardCase.setInv(500);
            keyboardCase.setPrice(80.00);
            partRepository.save(keyboardCase);

            InhousePart pcb = new InhousePart();
            pcb.setName("PCB");
            pcb.setId(162);
            pcb.setInv(500);
            pcb.setPrice(30.00);
            partRepository.save(pcb);
        }

        /*OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

         */
        if (productRepository.count()==0) {
            Product preBuiltJK100 = new Product("Prebuilt JK100", 280, 50);
            Product barebonesJK100 = new Product("Barebones JK100", 190, 50);
            Product preBuiltJK80 = new Product("Prebuilt JK80", 250, 50);
            Product barebonesJK80 = new Product("Barebones JK80", 160, 50);
            Product barebonesJK60 = new Product("Barebones JK60", 130, 50);
            productRepository.save(preBuiltJK80);
            productRepository.save(preBuiltJK100);
            productRepository.save(barebonesJK60);
            productRepository.save(barebonesJK80);
            productRepository.save(barebonesJK100);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
