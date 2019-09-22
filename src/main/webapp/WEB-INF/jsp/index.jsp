
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ZType – Typing Game - Type to Shoot</title>
    <link rel="shortcut icon" href="media/favicon.png" type="image/png">
    <link rel="icon" href="media/favicon.png" type="image/png">
    <style type="text/css">
        html,body {
            background-color: #f00;
            background-image: url(media/background/page.png);
            color: #0f0;
            font-family: helvetica, arial, sans-serif;
            margin: 0;
            padding: 0;
            font-size: 10pt;
        }
        a {
            color: #0f0;
            text-decoration: none;
            font-size: 18pt;

        }
        a:hover {
            color: #ccc;
            /*color:#f00;*/
        }

        .removeWord{
            color: #0f0;
            font-size:20pt;
        }
        #ztype-game-canvas {
            /*position: absolute;*/
            float: right;
            left: 0;
            right: 0;
            top: 0;
            bottom: 0;
            margin: auto;
            border: 0;
            z-index: 1000002;
            box-shadow: 0 0 40px #f00;
        }
        body.mobile #ztype-byline { display: none; }
        body.mobile #ztype-gsense { display: none; }
    </style>
    <script type="text/javascript" src="ztype.js" charset="UTF-8"></script>
    <script type="text/javascript" src="ztype-trainer.js" charset="UTF-8"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no"/>
</head>
<body>
<canvas id="ztype-game-canvas"></canvas>
<%--<h1>${msg} is here !!</h1>--%>
<table>
    <tr><th>word1</th><th>cn</th></tr>
</table>
</body>
</html>
