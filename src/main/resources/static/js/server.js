
layui.use(['layer', 'form'], function () {
    var form = layui.form;
    form.on('submit(eps-add)', function (data) {
        fetch('/eps/add', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data.field)
        }).then(res => {
            return res.json();
        }).then(response => {
            const json = JSON.parse(response);
            if (json.code === '0') {
                layer.msg('成功');
            } else {
                layer.msg('失败!' + json.result, {icon: 0}, function () {
                    console.log(json.stackTrace);
                });
            }
        }).catch(error => {
            console.log("失败 ===> ", error);
            layer.msg('失败:' + error);
        });
        return false;
    });
});