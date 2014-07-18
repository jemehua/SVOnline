package pe.org.cineplanet.util;

import java.awt.Color;
import javax.faces.context.FacesContext;

import com.lowagie.text.Chunk;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.GrayColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

public class TemplateReporteServir {
	
	public TemplateReporteServir(){
		
	}
	
	public HeaderFooter headerServir() {
		try {			
			
			float leading = 8f;
			String path = "/images/encabezado.png";
			String text = "\"Decenio de las Personas con Discapacidad en el Perú\"";
			String text2 = "\"Año del Centenario de Machu Picchu para el mundo\"";

			Font font2 = new Font(Font.NORMAL, 6);
			String ruta = FacesContext.getCurrentInstance().getExternalContext()
					.getRealPath(path);
			Image img = Image.getInstance(ruta);
			img.setAlignment(Element.ALIGN_CENTER);
			img.scalePercent(90, 75);
			Paragraph p = new Paragraph();
			p.setLeading(leading);
			p.add(new Chunk(img, 0, 0, true));
			p.add(new Chunk(text, font2));
			p.add(Chunk.NEWLINE);
			p.add(new Chunk(text2, font2));
			HeaderFooter header = new HeaderFooter(p, false);		
			header.setBorder(Rectangle.NO_BORDER); 
			header.setBorder(Rectangle.BOTTOM);
			header.setAlignment(Element.ALIGN_CENTER);
			
			return header;
			
		} catch (Exception e) {
			HeaderFooter header = new HeaderFooter(new Phrase("SERVIR"), false);
			return header;
		}

	}
	
	public HeaderFooter footerServir() {
		try {
			String text = "Pasaje Francisco de Zela 150 Piso 10 - Jesús María, Lima | (511) - 206 3370 | info@servir.gob.pe";
			Font font2 = new Font(Font.NORMAL, 8);
			Paragraph p = new Paragraph();
			p.add(new Chunk(text, font2));
			HeaderFooter footer = new HeaderFooter(p, false);
			footer.setAlignment(Element.ALIGN_CENTER);
			footer.setBorder(Rectangle.NO_BORDER); 
			footer.setBorder(Rectangle.TOP);
			return footer;
		} catch (Exception e) {
			HeaderFooter header = new HeaderFooter(new Phrase("SERVIR"), false);
			return header;
		}
		
	}
	
	public PdfPTable tablaFirma(){
		
		Font FONT = new Font(Font.NORMAL, 12, Font.BOLD, new GrayColor(1f));
		Font FONT1 = new Font(Font.NORMAL, 12, Font.BOLD, new GrayColor(0f));
		PdfPTable tablaFirma = new PdfPTable(3);
		
		try {
			
			tablaFirma.setHeaderRows(1);			
			float[] anchoCelda = {4.5f, 2f, 2f};
			tablaFirma.setWidths(anchoCelda); 
			tablaFirma.setTotalWidth(500.0F);
			tablaFirma.setLockedWidth(true);
			
			PdfPCell celHeader = new PdfPCell(new Phrase("Revisado y Aprobado por:", FONT1));
			celHeader.setBorder(Rectangle.NO_BORDER);
			celHeader.setColspan(3);
			celHeader.setHorizontalAlignment(Element.ALIGN_LEFT);
			tablaFirma.addCell(celHeader);
			
			PdfPCell celFirma = new PdfPCell(new Phrase("NOMBRE", FONT));
			celFirma.setBackgroundColor(Color.GRAY);
			celFirma.setHorizontalAlignment(Element.ALIGN_CENTER);
			tablaFirma.addCell(celFirma);
			PdfPCell celFirma2 = new PdfPCell(new Phrase("ROL", FONT));
			celFirma2.setBackgroundColor(Color.GRAY);
			celFirma2.setHorizontalAlignment(Element.ALIGN_CENTER);
			tablaFirma.addCell(celFirma2);
			PdfPCell celfirma3 = new PdfPCell(new Phrase("FIRMA", FONT));
			celfirma3.setBackgroundColor(Color.GRAY);
			celfirma3.setHorizontalAlignment(Element.ALIGN_CENTER);
			tablaFirma.addCell(celfirma3);
			
			PdfPCell celFirmaF1 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celFirmaF1);
			PdfPCell celFirma2F1 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celFirma2F1);
			PdfPCell celfirma3F1 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celfirma3F1);
			
			PdfPCell celFirmaF2 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celFirmaF2);
			PdfPCell celFirma2F2 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celFirma2F2);
			PdfPCell celfirma3F2 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celfirma3F2);
			
			PdfPCell celFirmaF3 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celFirmaF3);
			PdfPCell celFirma2F3 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celFirma2F3);
			PdfPCell celfirma3F3 = new PdfPCell(new Phrase(" ", FONT));
			tablaFirma.addCell(celfirma3F3);
			
		} catch (Exception e) {
			System.err.println("e: "+e);
		}
		
		return tablaFirma;
		
}

	public PdfPTable tableSpace1(){
		PdfPTable tableSpace1 = new PdfPTable(1);
		for (int i = 0; i < 1; i++) {
			PdfPCell celSpace1 = new PdfPCell(new Paragraph(" "));
			celSpace1.setBorder(Rectangle.NO_BORDER);
			tableSpace1.addCell(celSpace1);
		}
		
		return tableSpace1;
	}
	
	public PdfPTable tableSpace2(){
		PdfPTable tableSpace2 = new PdfPTable(1);
		for (int i = 0; i < 2; i++) {
			PdfPCell celSpace10 = new PdfPCell(new Paragraph(" "));
			celSpace10.setBorder(Rectangle.NO_BORDER);
			tableSpace2.addCell(celSpace10);
		}
		
		return tableSpace2;
	}
	
	public PdfPTable tableSpace10(){
		PdfPTable tableSpace10 = new PdfPTable(1);
		for (int i = 0; i < 10; i++) {
			PdfPCell celSpace10 = new PdfPCell(new Paragraph(" "));
			celSpace10.setBorder(Rectangle.NO_BORDER);
			tableSpace10.addCell(celSpace10);
		}
		
		return tableSpace10;
	}
}
