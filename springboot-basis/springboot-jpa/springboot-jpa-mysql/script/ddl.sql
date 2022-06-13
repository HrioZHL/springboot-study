create table test.td_m_depart
(
    id bigint auto_increment,
    name varchar(128) null comment '部门名称',
    `desc` varchar(128) null comment '描述',
    constraint td_m_depart_id_uindex
        unique (id)
)
    comment '部门表';

alter table test.td_m_depart
    add primary key (id);

create table test.td_m_salary
(
    id bigint auto_increment,
    salary int null comment '薪资',
    level char null comment '级别',
    constraint td_m_salary_id_uindex
        unique (id)
)
    comment '薪资表';

alter table test.td_m_salary
    add primary key (id);

create table test.td_m_staff
(
    id bigint auto_increment,
    name varchar(128) null comment '员工姓名',
    age int null comment '年龄',
    depart_id int null comment '部门编码',
    salary_id int null comment '薪资编码',
    constraint td_m_staff_id_uindex
        unique (id)
)
    comment '员工表';

alter table test.td_m_staff
    add primary key (id);

