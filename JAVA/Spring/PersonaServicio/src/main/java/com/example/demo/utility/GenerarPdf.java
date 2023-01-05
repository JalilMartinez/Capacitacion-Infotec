package com.example.demo.utility;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.example.demo.entity.Persona;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("/views/listar")
public class GenerarPdf extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Persona> listaPersona=(List<Persona>) model.get("persona");
		
		document.setPageSize(PageSize.LETTER.rotate());
		document.open();
		PdfPTable tablaTitulo = new PdfPTable(1);
		PdfPCell celda = null;
		celda = new PdfPCell(new Phrase("Listado General de Personas"));
		tablaTitulo.addCell(celda);
		tablaTitulo.setSpacingAfter(20);
		
		
		
		PdfPTable tablaNombres = new PdfPTable(3);
		PdfPCell celda1 = null;
		PdfPCell celda2 = null;
		PdfPCell celda3 = null;
		celda1 = new PdfPCell(new Phrase("id"));
		tablaNombres.addCell(celda1);
		celda2 = new PdfPCell(new Phrase("Nombre"));
		tablaNombres.addCell(celda2);
		celda3 = new PdfPCell(new Phrase("Apellidos"));
		tablaNombres.addCell(celda3);
		tablaNombres.setSpacingAfter(5);
		
		PdfPTable tablaPersona = new PdfPTable(3);
		listaPersona.forEach(persona->{
			tablaPersona.addCell(persona.getId().toString());
			tablaPersona.addCell(persona.getNombre());
			tablaPersona.addCell(persona.getApellidos());
		});
		
		document.add(tablaTitulo);
		document.add(tablaNombres);
		document.add(tablaPersona);
		
	}
	
}
