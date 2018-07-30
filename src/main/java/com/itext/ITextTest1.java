package com.itext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;

public class ITextTest1 {
	public static void main(String[] args) throws DocumentException, IOException {
		ITextRenderer renderer = new ITextRenderer();
		OutputStream os = new FileOutputStream("d:/iTextPDF.pdf");
		
		//renderer.setDocumentFromString("<span>okok</span>");
		
		URL url=ITextTest.class.getResource("test.html");
		renderer.setDocument(new File(url.getPath()));
		
		renderer.layout();
		renderer.createPDF(os);
	}
}
