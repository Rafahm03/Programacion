package ejerccio04;

import java.util.Map;

public class AgendaTelefonica {

	private Map<String, Contacto> agenda;

	public AgendaTelefonica(Map<String, Contacto> agenda) {
		super();
		this.agenda = agenda;
	}

	public Map<String, Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<String, Contacto> agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void add(Contacto c, String telefono) {
		agenda.put(telefono, c);
	}
	
	public void delete(Contacto c) {
		agenda.remove(c);
	}
	
	
	public Contacto findByTelefono(String telefono) {
        boolean encontrado = false;
        int i = 0;
        Contacto deLista = null;
        
        while (i < agenda.size() && !encontrado) {
            if (agenda.get(telefono).getTelefono().equalsIgnoreCase(telefono)) {
                deLista = agenda.get(telefono);
                encontrado = true;
            }else {
                i++;
            }
        }
        
        if (encontrado) {
            return deLista;
        }else {
            return null;
        }
    }
	
}
	
