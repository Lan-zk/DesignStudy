package top.collin.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    /**
     * id
     */
    String id;

    /**
     * 名称
     */
    String name;

    // ...

}
