package com.ways.framework.utils;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * 导出公共类
 * @author yinlue
 *
 */
public class ExportExcelUtil {

	/**
	 * 获取Excel标题背景样式
	 * @param wb
	 * @return
	 */
	public static CellStyle getExcelTitleBackgroundStyle(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.WHITE.getIndex());//设置字体颜色
		
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.WHITE.getIndex());//设置左边框颜色
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置单元格文本左对齐
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  

		//设置背景颜色
		style.setFillForegroundColor(IndexedColors.DARK_TEAL.getIndex());
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);

		style.setFont(font);//设置字体
		return style;
	}
	
	/**
	 * 获取Excel标题背景带下边框样式
	 * @param wb
	 * @return
	 */
	public static CellStyle getExcelTitleBackgroundToBottomStyle(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.WHITE.getIndex());//设置字体颜色
		
		style.setBorderBottom(CellStyle.SOLID_FOREGROUND);   
		style.setBottomBorderColor(IndexedColors.WHITE.getIndex());//设置下边框颜色
		
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.WHITE.getIndex());//设置左边框颜色
		
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);//设置单元格文本左对齐
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
		//设置背景颜色
		style.setFillForegroundColor(IndexedColors.DARK_TEAL.getIndex());
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);

		style.setFont(font);//设置字体
		return style;
	}
	
	/**
	 * 获取Excel填充文本样式
	 * @param wb
	 * @return
	 */
	public static CellStyle getExcelFillTextStyle(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.BLACK.getIndex());//设置字体颜色
		
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置单元格文本居中
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
		
		//设置背景颜色
		HSSFPalette customPalette = ((HSSFWorkbook) wb).getCustomPalette();  
		customPalette.setColorAtIndex(HSSFColor.GREY_25_PERCENT.index, (byte) 214, (byte) 214, (byte) 214); 
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);

		
		//设置边框颜色
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置左边框颜色
		style.setBorderBottom(CellStyle.SOLID_FOREGROUND);   
		style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置下边框颜色
		style.setBorderRight(CellStyle.SOLID_FOREGROUND);   
		style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置右边框颜色

		style.setFont(font);//设置字体
		style.setWrapText(true);//设置文本自动换行
		return style;
	}
	
	/**
	 * 获取Excel填充文本样式
	 * @param wb
	 * @return
	 */
	public static CellStyle getExcelDecimalStyle(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.BLACK.getIndex());//设置字体颜色
		
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置单元格文本居中
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
		
		//设置背景颜色
		HSSFPalette customPalette = ((HSSFWorkbook) wb).getCustomPalette();  
		customPalette.setColorAtIndex(HSSFColor.GREY_25_PERCENT.index, (byte) 214, (byte) 214, (byte) 214); 
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);

		
		//设置边框颜色
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置左边框颜色
		style.setBorderBottom(CellStyle.SOLID_FOREGROUND);   
		style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置下边框颜色
		style.setBorderRight(CellStyle.SOLID_FOREGROUND);   
		style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置右边框颜色

		HSSFDataFormat df = (HSSFDataFormat) wb.createDataFormat();
		style.setDataFormat(df.getFormat("#.####"));//设置字体
//		style.setWrapText(true);//设置文本自动换行
		return style;
	}
	
	public static CellStyle getExcelFillTextStyle2(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.BLACK.getIndex());//设置字体颜色
		
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置单元格文本居中
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
		
		//设置背景颜色
		HSSFPalette customPalette = ((HSSFWorkbook) wb).getCustomPalette();  
		customPalette.setColorAtIndex(HSSFColor.GREY_25_PERCENT.index, (byte) 192, (byte) 192, (byte) 192); 
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
	//	style.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		
		//设置边框颜色
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置左边框颜色
		style.setBorderBottom(CellStyle.SOLID_FOREGROUND);   
		style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置下边框颜色
		style.setBorderRight(CellStyle.SOLID_FOREGROUND);   
		style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置右边框颜色

		style.setFont(font);//设置字体
//		style.setWrapText(true);//设置文本自动换行
		return style;
	}
	
	/**
	 * 获取Excel填充数百分号样式
	 * @param wb
	 * @return
	 */
	public static CellStyle getExcelFillPercentageStyle(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.BLACK.getIndex());//设置字体颜色
		style.setFont(font);//设置字体
		
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置单元格文本居中
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
		
		//设置背景颜色
		HSSFPalette customPalette = ((HSSFWorkbook) wb).getCustomPalette();  
		customPalette.setColorAtIndex(HSSFColor.GREY_25_PERCENT.index, (byte) 214, (byte) 214, (byte) 214); 
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		
		//设置边框颜色
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置左边框颜色
		style.setBorderBottom(CellStyle.SOLID_FOREGROUND);   
		style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置下边框颜色
		style.setBorderRight(CellStyle.SOLID_FOREGROUND);   
		style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置右边框颜色

		HSSFDataFormat df = (HSSFDataFormat) wb.createDataFormat();      
		style.setDataFormat(df.getFormat("0.0%"));//设置单元格数据格式
		return style;
	}
	
	/**
	 * 获取Excel格式化千分号样式
	 * @param wb
	 * @return
	 */
	public static CellStyle getExcelFormatThousandthStyle2(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.BLACK.getIndex());//设置字体颜色
		style.setFont(font);//设置字体
		
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置单元格文本左对齐
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
		
		//设置背景颜色
		HSSFPalette customPalette = ((HSSFWorkbook) wb).getCustomPalette();  
		customPalette.setColorAtIndex(HSSFColor.GREY_25_PERCENT.index, (byte) 191, (byte) 191, (byte) 191); 
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		
		//设置边框颜色
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置下边框颜色
		style.setBorderBottom(CellStyle.SOLID_FOREGROUND);   
		style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置左边框颜色
		style.setBorderRight(CellStyle.SOLID_FOREGROUND);   
		style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置右边框颜色

		HSSFDataFormat df = (HSSFDataFormat) wb.createDataFormat();      
		style.setDataFormat(df.getFormat("###,#"));//设置单元格数据格式
		return style;
	}
	
	public static CellStyle getExcelFormatThousandthStyle(Workbook wb)
	{
		CellStyle style = wb.createCellStyle();
		Font font = wb.createFont();   
		font.setColor(IndexedColors.BLACK.getIndex());//设置字体颜色
		style.setFont(font);//设置字体
		
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//设置单元格文本左对齐
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
		
		//设置背景颜色
		HSSFPalette customPalette = ((HSSFWorkbook) wb).getCustomPalette();  
		customPalette.setColorAtIndex(HSSFColor.GREY_25_PERCENT.index, (byte) 214, (byte) 214, (byte) 214); 
		style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
		
		//设置边框颜色
		style.setBorderLeft(CellStyle.SOLID_FOREGROUND);   
		style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置下边框颜色
		style.setBorderBottom(CellStyle.SOLID_FOREGROUND);   
		style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置左边框颜色
		style.setBorderRight(CellStyle.SOLID_FOREGROUND);   
		style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());//设置右边框颜色

		HSSFDataFormat df = (HSSFDataFormat) wb.createDataFormat();      
		style.setDataFormat(df.getFormat("###,#"));//设置单元格数据格式
		return style;
	}
	
	/**
	 * 创建行
	 * @param s
	 * @param rowIndex 行号锁引
	 * @param lineHeight 行高
	 * @return
	 */
	public static Row createRow(Sheet s,int rowIndex,int lineHeight)
	{
		Row row = s.createRow(rowIndex);
		row.setHeight((short)lineHeight);
		return row;
	}
	
	/**
	 * 设置单元格值和样式
	 * @param cell
	 * @param value
	 * @param style
	 */
	public static void setCellValueAndStyle(Cell cell,String value,CellStyle style)
	{
		String reg = "^-?\\d+\\.?\\d*$";
		if(AppFrameworkUtil.isEmpty(value))
		{
			cell.setCellValue(""); 
		}
		else
		{
			if(!AppFrameworkUtil.isEmpty(value) && !"-".equals(value) && value.matches(reg) && !"0".equals(value) && !"0.0".equals(value))
			{
				cell.setCellValue(Double.parseDouble(value)); 
			}
			else
			{
				cell.setCellValue(value.replace("~", ""));
			}
		}
		if(null != style) cell.setCellStyle(style);
	}
	
	/**
	 * 设置单元格值添加百分号
	 * @param cell
	 * @param value
	 * @param style
	 */
	public static void setCellValueToPercentage(Cell cell,String value,CellStyle style)
	{
		if(!AppFrameworkUtil.isEmpty(value) && !"-".equals(value))
		{
			cell.setCellValue(Double.parseDouble(value) / 100); 
		}
		else
		{
			cell.setCellValue(value); 
		}
		
		cell.setCellStyle(style);
	}
	
}
