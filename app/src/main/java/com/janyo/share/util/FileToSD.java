package com.janyo.share.util;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToSD
{
	Context context;
	
	public FileToSD(Context context,String inputPath,String outputPath,String versionName) throws IOException
	{
		this.context = context;
		
		File outFile = new File(Environment.getExternalStorageDirectory(),outputPath);
		InputStream is = new FileInputStream(inputPath);
		FileOutputStream fos = new FileOutputStream(outFile+"_"+versionName+".apk");
		byte[] Buff = new byte[1024];
		
		int fileSize = 0;
		int ReadCount = 0;
		while((ReadCount = is.read(Buff))!=-1)
		{
			fileSize += ReadCount;
			fos.write(Buff, 0, ReadCount);
		}
		is.close();
	}
}
