/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Activity.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class TableController {
    
    @RequestMapping("/dataKTP")
    public String getTable(Model List){
        
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("ID", "Nomor KTP", "Nama", "Alamat"));
        data.add(Arrays.asList("102001", "6403052205020002", "Andre", "Berau"));
        data.add(Arrays.asList("102002", "6403063012030221", "Eki", "Palu"));
        data.add(Arrays.asList("102003", "6403051305019221", "Eka", "Yogyakarta"));
        data.add(Arrays.asList("102004", "6404042204110231", "Erhan", "Balikpapan"));
        data.add(Arrays.asList("102005", "6322930119339281", "Ahmad", "Banjarmasin"));
        data.add(Arrays.asList("102006", "8301831127399464", "Zaidan", "Medan"));
        data.add(Arrays.asList("102007", "7321833817394821", "Alvin", "Pontianak"));
        data.add(Arrays.asList("102008", "4829927463615442", "Jessie", "Jakarta"));
        data.add(Arrays.asList("102009", "6402013372663722", "Putri", "Makassar"));
        data.add(Arrays.asList("102010", "6288177552816631", "Kiky", "Batam"));
        data.add(Arrays.asList("102011", "3527715537719937", "Rafi", "Yogyakarta"));
        data.add(Arrays.asList("102012", "4653755371378113", "Novi", "Solo"));
        data.add(Arrays.asList("102013", "7361538186497284", "Barik", "Riau"));
        data.add(Arrays.asList("102014", "6286316427642131", "Fayad", "Samarinda"));
        data.add(Arrays.asList("102015", "6428166388866123", "Oura", "Batam"));
        data.add(Arrays.asList("102016", "7419297472774628", "Funi", "Surabaya"));
        data.add(Arrays.asList("102017", "7492277729499274", "Kayes", "Bandung"));
        data.add(Arrays.asList("102018", "7366193725882663", "Zuxxy", "Bali"));
        data.add(Arrays.asList("102019", "3817399277629294", "Vivi", "Jawa Barat"));
        data.add(Arrays.asList("102020", "3561388362638818", "Sappo", "Makassar"));
        
        List.addAttribute("tabel", data);
        return "TableViewer";
    }
}
