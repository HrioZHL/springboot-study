package com.hrio.springboot.basis.exception.example.alpha.assertion.enums;

import com.hrio.springboot.basis.exception.example.alpha.assertion.IResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.servlet.http.HttpServletResponse;

/**
 * Servlet异常返回枚举
 *
 * @author Hrio
 * @date 2022/05/31
 */
@Getter
@AllArgsConstructor
public enum ServletResponseEnum implements IResponseEnum {

    /**
     * 接口不存在
     * 首先根据请求Url查找有没有对应的控制器，若没有则会抛该异常，也就是大家非常熟悉的404异常
     */
    NoHandlerFoundException("4404", "接口不存在", HttpServletResponse.SC_NOT_FOUND),

    /**
     * 请求类型错误
     * 若匹配到了（匹配结果是一个列表，不同的是http方法不同，如：Get、Post等），则尝试将请求的http方法与列表的控制器做匹配，若没有对应http方法的控制器，则抛该异常
     */
    HttpRequestMethodNotSupportedException("4405", "请求类型错误", HttpServletResponse.SC_METHOD_NOT_ALLOWED),

    /**
     * 然后再对请求头与控制器支持的做比较，比如content-type请求头，若控制器的参数签名包含注解@RequestBody，但是请求的content-type请求头的值没有包含application/json，那么会抛该异常（当然，不止这种情况会抛这个异常）
     */
    HttpMediaTypeNotSupportedException("4415", "", HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE),

    /**
     * 未检测到路径参数。比如url为：/licence/{licenceId}，参数签名包含@PathVariable("licenceId")，当请求的url为/licence，在没有明确定义url为/licence的情况下，会被判定为：缺少路径参数；
     */
    MissingPathVariableException("4400", "", HttpServletResponse.SC_BAD_REQUEST),

    /**
     * 缺少请求参数。比如定义了参数@RequestParam("licenceId") String licenceId，但发起请求时，未携带该参数，则会抛该异常；
     */
    MissingServletRequestPartException("4400", "", HttpServletResponse.SC_BAD_REQUEST),

    /**
     * 参数类型匹配失败。比如：接收参数为Long型，但传入的值确是一个字符串，那么将会出现类型转换失败的情况，这时会抛该异常；
     */
    TypeMismatchException("4400", "", HttpServletResponse.SC_BAD_REQUEST),

    /**
     * 与上面的HttpMediaTypeNotSupportedException举的例子完全相反，即请求头携带了"content-type: application/json;charset=UTF-8"，但接收参数却没有添加注解@RequestBody，或者请求体携带的 json 串反序列化成 pojo 的过程中失败了，也会抛该异常
     */
    HttpMessageNotReadableException("4400", "", HttpServletResponse.SC_BAD_REQUEST),

    /**
     * 返回的 pojo 在序列化成 json 过程失败了，那么抛该异常；
     */
    HttpMessageNotWritableException("4500", "", HttpServletResponse.SC_INTERNAL_SERVER_ERROR),

    MethodArgumentTypeMismatchException("4400", "", HttpServletResponse.SC_BAD_REQUEST),

    MissingServletRequestParameterException("4400", "", HttpServletResponse.SC_BAD_REQUEST),

    HttpMediaTypeNotAcceptableException("4406", "", HttpServletResponse.SC_NOT_ACCEPTABLE),

    ServletRequestBindingException("4400", "", HttpServletResponse.SC_BAD_REQUEST),

    ConversionNotSupportedException("4500", "", HttpServletResponse.SC_INTERNAL_SERVER_ERROR),

    AsyncRequestTimeoutException("4503", "", HttpServletResponse.SC_SERVICE_UNAVAILABLE);

    private String code;

    private String message;

    private int httpStatusCode;
}
