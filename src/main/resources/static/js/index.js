var body = document.getElementById('body');
body.style.backgroundImage = "url('img/beijing_one.bmp')";
// var blood = document.getElementById('blood');
// blood.style.backgroundImage = "url('img/blood.png')";
var role = document.getElementById('role');
var gold = document.getElementById('gold');
gold.style.backgroundImage = "url('img/gold.png')";

//声明Game_data对象
var id,
user_id,
username,
strength,
fight_count,
equipment,
money,
career,equipped,res_data,online_time;
var Game_data = new Array(id,user_id,username,strength,fight_count,equipment,money,career,equipped,res_data,online_time);


//选择角色判断   战士warrior    法师magic     骑士knight
var warrior;
var magic;
var knight;
var role = true;
function roLe(warrior,magic){
    if(role == warrior){
        document.getElementById('role').style.backgroundImage = "url('img/role_warrior.png')"
    }
    else if(role == magic){
        document.getElementById('role').style.backgroundImage = "url('img/role_magic.png')"
    }
    else{
        document.getElementById('role').style.backgroundImage = "url('img/role_knight.png')"
    };
}
roLe(0,1);

//被点击弹出面板的事件
var chat_room = $('#chat_room');
var chat = $('#chat');
var fight = $('#fight');
var fight_panel = $('#fight_panel');
var self = $('#self');
var self_panel_warrior = $('#self_panel_warrior');
var self_panel_magic = $('#self_panel_magic');
var self_panel_knight = $('#self_panel_knight');
var skill = $('#skill');
var skill_panel = $('#skill_panel');
var plot = $('#plot');
var plot_panel = $('#plot_panel');
var friend = $('#friend');
var friend_panel = $('#friend_panel');
var goods = $('#goods');
var goods_panel = $('#goods_panel');
var set = $('#set');
var set_panel = $('#set_panel');
var help = $('#help');
var help_panel = $('#help_panel');
chat_room.on('click',function(){
    if(chat.is(':visible')){
        // chat.hide();   //直接消失

        chat.slideUp(500)   //过渡消失
    }
    else{
        chat.slideDown(500);
    }
});
fight.on('click',function(){
    if(fight_panel.is(':visible')){
        // chat.hide();   //直接消失

        fight_panel.slideUp(500)   //过渡消失
    }
    else{
        fight_panel.slideDown(500);
    }
});
self.on('click',function(){
    if(0){
        if(self_panel_warrior.is(':visible')){
            // chat.hide();   //直接消失
    
            self_panel_warrior.slideUp(500)   //过渡消失
        }
        else{
            self_panel_warrior.slideDown(500);
        }
    }
    else if(1){
        if(self_panel_magic.is(':visible')){
            // chat.hide();   //直接消失
    
            self_panel_magic.slideUp(500)   //过渡消失
        }
        else{
            self_panel_magic.slideDown(500);
        }
    }
    else{
        if(self_panel_knight.is(':visible')){
            // chat.hide();   //直接消失
    
            self_panel_knight.slideUp(500)   //过渡消失
        }
        else{
            self_panel_knight.slideDown(500);
        }
    };

});
skill.on('click',function(){
    if(skill_panel.is(':visible')){
        // chat.hide();   //直接消失

        skill_panel.slideUp(500)   //过渡消失
    }
    else{
        skill_panel.slideDown(500);
    }
});
plot.on('click',function(){
    if(plot_panel.is(':visible')){
        // chat.hide();   //直接消失

        plot_panel.slideUp(500)   //过渡消失
    }
    else{
        plot_panel.slideDown(500);
    }
});
friend.on('click',function(){
    if(friend_panel.is(':visible')){
        // chat.hide();   //直接消失

        friend_panel.slideUp(500)   //过渡消失
    }
    else{
        friend_panel.slideDown(500);
    }
});
goods.on('click',function(){
    if(goods_panel.is(':visible')){
        // chat.hide();   //直接消失

        goods_panel.slideUp(500)   //过渡消失
    }
    else{
        goods_panel.slideDown(500);
    }
});
set.on('click',function(){
    if(set_panel.is(':visible')){
        // chat.hide();   //直接消失

        set_panel.slideUp(500)   //过渡消失
    }
    else{
        set_panel.slideDown(500);
    }
});
help.on('click',function(){
    if(help_panel.is(':visible')){
        // chat.hide();   //直接消失

        help_panel.slideUp(500)   //过渡消失
    }
    else{
        help_panel.slideDown(500);
    }
});