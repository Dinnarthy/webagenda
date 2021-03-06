package br.com.webagenda.EstadoCidade;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "converterEstado")
public class ConverterEstado implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		if (value != null && !value.equals("")) {
			EstadoCidadeRN estadoCidadeRN = new EstadoCidadeRN();
			return estadoCidadeRN.getByIdEstado(Long.valueOf(value));
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		if (value instanceof Estado) {
			Estado estado = (Estado) value;
			return String.valueOf(estado.getIdEstado());
		}
		return "";
	}

}
