package com;

import java.io.IOException;

public class Wk {
	public static void main(String[] args) throws IOException {
		StringBuffer command = new StringBuffer();
		command.append(" --page-size A4");
		command.append(" --margin-top 0mm");
		command.append(" --margin-bottom 0mm");
		command.append(" --margin-right 0mm");
		command.append(" --margin-left 0mm");
		command.append(" --orientation Landscape");
		
		
		command.append(" --page-size A4");
		command.append(" --margin-top 15mm");
		command.append(" --margin-bottom 8mm");
		command.append(" --margin-right 5mm");
		command.append(" --margin-left 5mm");
		
		Process process = Runtime.getRuntime().exec("D:\\wkhtmltopdf\\wkhtmltopdf.exe "+command+" http://172.16.0.8:8080/ytw-web/index-ycj.shtml d://a.pdf");
	}
}
