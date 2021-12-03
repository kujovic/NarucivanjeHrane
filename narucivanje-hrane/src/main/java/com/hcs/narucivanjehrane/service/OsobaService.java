package com.hcs.narucivanjehrane.service;

import java.util.List;
import com.hcs.narucivanjehrane.entity.*;

public interface OsobaService {
	List<Osoba> vratiSveOsobe();
	Osoba sacuvajOsobu(Osoba osoba);
	Osoba vratiOsobuPoID(Long id);
	Osoba izmeniOsobu(Osoba osoba);
	void izbrisiOsobuPoID(Long id);
}
