package br.com.webagenda.EstadoCidade;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="converterCidade")
public class ConverterCidade implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.equals("")) {
			EstadoCidadeRN estadoCidadeRN = new EstadoCidadeRN();
			return estadoCidadeRN.getByIdCidade(Long.valueOf(value));
			}
			return null;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof Cidade) {
			Cidade municipio = (Cidade) value;
			return String.valueOf(municipio.getIdCidade());
			}
			return "";
			}
		
		
	
	

}
