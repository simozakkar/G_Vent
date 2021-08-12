<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 7/24/21
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title><s:property value="article.nomArt"/> Ray Ban</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body>
    <nav class="navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar">
        <div class="container">
            <a class="navbar-brand logo" href="index.action">
                <img src="assets/img/logo.png" style="width: 81px;height: 50px;">
            </a>
            <button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="navbar-nav ml-auto">
                    <s:if test="%{#session.isConnect}">
                        <li class="nav-item"><span class="nav-link">Welecome <s:property value="#session.user.name" /></span></li>
                        <li class="nav-item"><a class="nav-link" href="logout.action"><img src="assets/img/icons/logout.svg"></a></li>
                        <li class="nav-item"><a class="nav-link" href="settings.action"><img src="assets/img/icons/settings.svg"></a></li>
                    </s:if>
                    <s:else>
                        <li class="nav-item"><a class="nav-link" href="login.action">Login</a></li>
                        <li class="nav-item"><a class="nav-link" href="register.action">Register</a></li>
                    </s:else>
                </ul>
            </div>
        </div>
    </nav>
    <main class="page product-page">
        <section class="clean-block clean-product dark">
            <div class="container">
                <div class="block-content">
                    <div class="product-info">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="gallery">
                                    <div id="sliderProduct" class="carousel slide" data-ride="carousel">
                                        <ol class="carousel-indicators">
                                            <li data-target="#sliderProduct" data-slide-to="0" class="active"></li>
                                            <li data-target="#sliderProduct" data-slide-to="1"></li>
                                        </ol>
                                        <div class="carousel-inner">
                                            <div class="carousel-item active">
                                                <img class="d-block w-100" src="assets/img/produits/<s:property value="idArt"/>.jpg" alt="First slide">
                                            </div>
                                            <div class="carousel-item">
                                                <img class="d-block w-100" src="assets/img/produits/<s:property value="idArt"/>.jpg" alt="Second slide">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="info">
                                    <h3><s:property value="article.nomArt"/></h3>
                                    <div class="rating">
                                        <s:iterator var="counter" begin="1" end="article.stars" >
                                            <img src="assets/img/icons/star.svg">
                                        </s:iterator>
                                        <s:iterator var="counter" begin="1" end="article.starsHalfEmpty" >
                                            <img src="assets/img/icons/star-half-empty.svg">
                                        </s:iterator>
                                        <s:iterator var="counter" begin="1" end="article.starsEmpty" >
                                            <img src="assets/img/icons/star-empty.svg">
                                        </s:iterator>
                                    </div>
                                    <div class="category">
                                        <span style="font-weight: bold"><s:property value="article.categ"/></span> for <span style="font-weight: bold"><s:if test='%{article.genderArt == "M"}'>Men</s:if><s:else>Women</s:else></span>
                                    </div>
                                    <div class="price">
                                        <h3>$<s:property value="article.prixArt"/></h3>
                                    </div>
                                    <s:if test="%{quantity > 0}">
                                        <s:if test="%{quantity < 16}">
                                            <p><span class="text-danger">Only <s:property value="quantity"/> left in stock - order soon</span></p>
                                        </s:if>
                                        <s:url var="paymentPage" action="payment">
                                            <s:param name="idArt" value="idArt"/>
                                        </s:url>
                                        <s:a href="%{paymentPage}" >
                                            <button class="btn btn-primary" type="button">Buy</button>
                                        </s:a>
                                    </s:if>
                                    <s:else>
                                        <span class="text-danger">Currently unavailable.</span>
                                    </s:else>
                                    <div class="summary">
                                        <p><s:property value="article.descArt"/></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>
    <footer class="page-footer dark">
        <div class="footer-copyright">
            <p>© 2021 UAE FS TETOUAN</p>
        </div>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
</body>

</html>
