package com.uiFramework.companyName.projectName.helper.resource;

/**
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class ResourceHelper {

	public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        System.out.println(basePath +"/"+ path);
		return basePath +"/"+ path;
	}
}
