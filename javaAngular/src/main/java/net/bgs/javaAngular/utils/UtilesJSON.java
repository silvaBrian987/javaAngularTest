package net.bgs.javaAngular.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class UtilesJSON {
	public static String POJOtoJSON(Object o) {
		StringBuilder json = new StringBuilder();
		List<String> elements = new ArrayList<String>();

		json.append("{");

		for (Method m : o.getClass().getMethods()) {
			String suffix = m.getName().substring(0, 3).toLowerCase();
			if (suffix.toLowerCase().equals("get")) {
				if (m.getParameterTypes().length == 0) {
					String name = m.getName().toLowerCase();
					name = name.substring(3, name.length());
					try {
						// json.append("\"" + name + "\":\"" + m.invoke(o, null)
						// + "\"");
						elements.add("\"" + name + "\":\"" + m.invoke(o, null) + "\"");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		json.append(StringUtils.join(elements.toArray(), ","));
		json.append("}");

		return json.toString();
	}
}
