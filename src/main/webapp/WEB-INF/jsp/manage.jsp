<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maddiecarpenter
  Date: 2019-09-18
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>ztype 管理界面</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script>
        $(function () {


            $("#startGame").click(function () {

                $.ajax({
                    type: "post",
                    // url: "word/ztype",
                    url:"http://localhost:9523/eto",
                    dataType: "json",
                    success: function (data) {
                        alert("start game")
                    },
                    error: function () {
                        alert("XX start game");
                    }
                });
            });

            $("#deleteWord").click(function () {
                var ids = [];
                $("input[type='checkbox']:checked").each(function (i) {
                    ids[i] = $(this).val();
                    alert("id["+i+"]: "+ids[i]);
                });

                $.ajax({
                    type: "post",
                    // url: "word/delete",
                    url:"http://localhost:9523/eto/word/delete",
                    data: {"ids": ids},
                    //数据 ids必须要打上括号
                    dataType: "json",
                    success: function (data) {
                            alert(data.msg);
                    },
                    error: function () {
                        alert("ajax fail to send data");
                    }
                });
            });
        });
    </script>
</head>

<body>
<input type="button" value="delete" id="deleteWord">
<input type="button" value="startGame" id="startGame">
    <table>
        <thead>
        <tr>
            <th>id</th>
            <th>word</th>
            <th>cn</th>
            <th>en</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="word" items="${words}">
            <tr>
                <td><input type="checkbox" class="checkWord" value="${word.id}" name="chkWord">${word.id}</td>
                <td>${word.word}</td>
                <td>${word.cn}</td>
                <td>${word.en}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
<body>

<p>点击这个段落。</p>

</body>
</html>