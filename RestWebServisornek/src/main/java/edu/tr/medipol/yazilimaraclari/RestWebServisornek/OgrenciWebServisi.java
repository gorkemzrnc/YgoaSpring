package edu.tr.medipol.yazilimaraclari.RestWebServisornek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServisi {
	public record Ogrenci(String adSoyad, String numara) {};

	private static final List<Ogrenci> OGRENCI_LISTESI = new ArrayList<>();
	
	static {
		OGRENCI_LISTESI.add(new Ogrenci("Gorkem Zurnaci","1"));
		OGRENCI_LISTESI.add(new Ogrenci("Gorkem Zurnaci","1"));
		OGRENCI_LISTESI.add(new Ogrenci("Gorkem Zurnaci","1"));
	}
	
	@GetMapping("/")
	public List<Ogrenci> listele(){
		return OGRENCI_LISTESI;
	}
	
}
