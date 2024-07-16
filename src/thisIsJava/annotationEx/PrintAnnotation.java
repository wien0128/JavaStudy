package thisIsJava.annotationEx;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 적용 대상: 메소드
@Retention(RetentionPolicy.RUNTIME) // 유지 정책: 런타임
public @interface PrintAnnotation {
    String value() default "-"; // value 속성: 선의 종류
    int number() default 15;    // number 속성: 출력 횟수
}
