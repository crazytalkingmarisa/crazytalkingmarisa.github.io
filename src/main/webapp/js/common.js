let Web = {
    request: function (cmd, data, listenet) {
        if (cmd == null) {
            alert("local error:cmd is empty")
            return;
        }
        let json = {
            type: "POST",
            url: "/admin/api",
            dataType: "Json",
            success: function (response) {
                console.log(response);
                if (response.code == "1") {
                    listenet.onSuccess(response);
                } else {
                    listenet.onError(response);
                }
            },
            error: function (xmlHttpRequest, errorMsg, exception) {
                let response = {
                    code: "L0000",
                    msg: errorMsg
                };
                listenet.onError(response);
            }
        }

        let postJson = {
            "cmd": cmd
        };
        if (data != null) {
            postJson.data = data;
        }
        json.data = JSON.stringify({
            "cmd": cmd,
            "data": data
        });
        $.ajax(json);
    }
}

let Utils = {
    getSuffix: function (name) {
        let index = name.lastIndexOf(".");
        if (index < 0) {
            return;
        }

        let suffix = name.substring(index + 1);
        return suffix;
    },
    getImageInfo: function (imageFile, listener) {
        let reader = new FileReader();
        reader.onload = function (e) {
            let data = e.target.result;
            let image = new Image();
            image.onload = function () {
                listener(image.width, image.height);
            }
            image.src = data;
        }
        reader.readAsDataURL(imageFile);
    },
    /*
    作者：laixiao_hero
    来源：CSDN
    原文：https://blog.csdn.net/laixiao_hero/article/details/78665592
    版权声明：本文为博主原创文章，转载请附上博文链接！
     */
    validMoney: function (money) {
        let reg = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
        if (reg.test(money)) {
            return true;
        } else {
            return false;
        };
    }
};


let Cookie = {
    get: function (name) {
        var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
        if (arr = document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    },
    set: function (name, value, expireDays) {
        var exdate = new Date()
        exdate.setDate(exdate.getDate() + expireDays)
        document.cookie = name + "=" + encodeURI(value) +
            ((expireDays == null) ? "" : ";expires=" + exdate.toUTCString());
    }
}

