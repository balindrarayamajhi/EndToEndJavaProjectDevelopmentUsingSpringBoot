package com.balindra.location.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;


@Component
public class ReportUtilImpl implements ReportUtil {


	
	@Override
	public void generatePieChart(String path, List<Object[]> data) {
		DefaultPieDataset dataset= new DefaultPieDataset();
		data.forEach(obj ->{
			dataset.setValue(obj[0].toString(),new Double(obj[1].toString()) );
		});
		
		JFreeChart chart=ChartFactory.createPieChart3D("Location Type PieChart",dataset);
		
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/reports/piechart/locationtype.jpeg"),chart,300,300);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
