<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <style>
        .head_shift {
            margin-top: 180px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="EShop">EShop</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <div class="row">
                <div class="col-lg-6">
                    <form class="navbar-form navbar-right">
                        <div class="input-group">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">Search</button>
                        </span>
                            <input type="text" class="form-control">
                        </div>
                    </form>
                </div>
                <div class="col-lg-4">
                    <a href="/shopingCart" class="btn btn-success">Shoping cart</a>
                </div>
            </div>

            <div class="container">
                <ul class="btn-group btn-group-justified" role="group" aria-label="...">
                    <c:forEach items="${catalogs}" var="catalog">
                        <li class="btn-group">
                            <a href="/catalog/${catalog.id}" class="btn btn-default">${catalog.name}</a>
                        </li>
                    </c:forEach>
                </ul>
            </div>

        </div>
    </div>
</nav>
<div class="head_shift"></div>



