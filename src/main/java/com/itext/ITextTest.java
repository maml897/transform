package com.itext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class ITextTest {
	private static final String DEST = "E://HelloWorld_CN_HTML.pdf";

	public static void main(String[] args) throws IOException, DocumentException {
		URL url=ITextTest.class.getResource("test.html");
		
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(DEST));
		document.open();

		XMLWorkerFontProvider fontImp = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
		XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(url.getPath()), null,
				Charset.forName("UTF-8"), fontImp);
		
		document.close();
	}
}
