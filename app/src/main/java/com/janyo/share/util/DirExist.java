package com.janyo.share.util;

import android.os.Environment;
import java.io.File;

public class DirExist
{
	String sdcard = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
	
	public DirExist(String dir)
	{
		File file = new File(sdcard + dir + File.separator);
		if(!file.exists())
		{
			file.mkdir();
		}
	}
}
