
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>支付</title>
    </head>
    <body>

        <div id="myQrcode1"></div>
        <div id="myQrcode2"></div>
        <div id="myQrcode3"></div>
        <script src="https://cdn.bootcss.com/jquery/1.5.1/jquery.min.js"></script>
        <script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
        <script>
            jQuery('#myQrcode1').qrcode({
                text: "${urlList[0]}"
            });
            jQuery('#myQrcode2').qrcode({
            text: "${urlList[1]}"
            });
            jQuery('#myQrcode3').qrcode({
            text: "${urlList[2]}"
            });

        </script>
    </body>
</html>
