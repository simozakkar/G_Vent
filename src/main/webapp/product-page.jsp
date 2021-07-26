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
    <title>Product - Brand</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
    <link rel="stylesheet" href="assets/css/smoothproducts.css">
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
                    <li class="nav-item">
                        <a class="nav-link" href="shopping.action">
                            <img src="assets/img/icons/shopping_cart.svg" style="opacity: 0.5">
                            Shopping Cart
                        </a>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="login.action">Login</a></li>
                    <li class="nav-item"><a class="nav-link" href="register.action">Register</a></li>
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
                                    <div class="sp-wrap">
                                        <a href="assets/img/produits/<s:property value="idArt"/>.jpg">
                                            <img class="img-fluid d-block mx-auto" src="assets/img/produits/<s:property value="idArt"/>.jpg">
                                        </a>
                                        <a href="assets/img/produits/<s:property value="idArt"/>.jpg">
                                            <img class="img-fluid d-block mx-auto" src="assets/img/produits/<s:property value="idArt"/>.jpg">
                                        </a>
                                        <a href="assets/img/produits/<s:property value="idArt"/>.jpg">
                                            <img class="img-fluid d-block mx-auto" src="assets/img/produits/<s:property value="idArt"/>.jpg">
                                        </a>
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
                                    <div class="price">
                                        <h3>$<s:property value="article.prixArt"/></h3>
                                    </div>
                                    <button class="btn btn-primary" type="button">
                                        <i class="icon-basket"></i>Add to Cart
                                    </button>
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
    <script src="assets/js/smoothproducts.min.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>
