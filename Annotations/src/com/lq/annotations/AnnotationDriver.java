package com.lq.annotations;
import com.lq.annotations.MyAnnotation;
import static java.lang.System.out;

import java.lang.annotation.Annotation;

public class AnnotationDriver {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class[] classes = { UseAnnotation.class };
		
		for(Class obj : classes){
			Annotation[] annotations = obj.getAnnotations();
			out.println("Number of annotations: " + annotations.length);
			for( Annotation annotation : annotations) {
				MyAnnotation a = (MyAnnotation) annotation;
				out.println(a.name());
			}
		}
	}

}
