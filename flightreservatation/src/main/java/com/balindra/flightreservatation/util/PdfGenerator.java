package com.balindra.flightreservatation.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.balindra.flightreservatation.entity.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PdfGenerator {
	
	public void generateItenary(Reservation reservation,String filepath) {
		Document document=new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filepath));
			document.open();
			//document.add(new PdfPTable(2));
			document.add(generateTable(reservation));
			document.close();
		} catch (FileNotFoundException | DocumentException e) {
			
			e.printStackTrace();
		}
		
	}

	private PdfPTable generateTable(Reservation reservation) {
		PdfPTable table=new PdfPTable(2);
		PdfPCell cell;
		cell=new PdfPCell(new Phrase("Flight Itenary"));
		cell.setColspan(2);
		
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("Flight Details"));
		cell.setColspan(2);
		
		table.addCell(cell);
		
		table.addCell("Airline");
		table.addCell(reservation.getFlight().getOperatingAirline());
		
		table.addCell("Departure city");
		table.addCell(reservation.getFlight().getDepartureCity());
		
		table.addCell("Arrival city");
		table.addCell(reservation.getFlight().getArrivalCity());
		
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFightnumber());
		
		table.addCell("Departure Date");
		table.addCell(reservation.getFlight().getDateOfDeparture().toString());
		
		table.addCell("Departure Time");
		table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
		
		
		cell=new PdfPCell(new Phrase("Pessanger Details"));
		cell.setColspan(2);
		
		table.addCell(cell);
		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstname());
		
		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastname());
		
		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());
		
		table.addCell("Phone");
		table.addCell(reservation.getPassenger().getPhone());
		
		
	
		return table;
	}

}
