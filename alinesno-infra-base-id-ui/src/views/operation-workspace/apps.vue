<template>
  <div>
    <el-row class="acp-dashboard-panel" :gutter="20">
      <el-col class="panel-col" :span="19">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 业务最新巡检</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
              <div class="direct-box">
                <ul>
                  <li class="box-item" v-for="item in directContent" :key="item">
                    <div class="dire-panel">
                      <div class="panel-title">
                        <!-- <img class="dire-panel-icon" :src="item.icon" :alt="item.name" /> -->
                        <i class="dire-panel-icon" :class="item.icon" :alt="item.name" />
                        {{ item.name }}
                      </div>
                      <div class="panel-describe">通过简单几步，图中7种主流开发环境轻松部署，摆脱海量文档搜索之苦。</div>
                      <div class="panel-tip">访问链接</div>
                    </div>
                  </li>
                </ul>
              </div>
          </div>
        </div>
      </el-col>
      <el-col :span="5">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 构建解决方案</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
            <div class="acp-app-list">
              <ul>
                <li class="app-items" style="width:100%" v-for="item in apps" :key="item">
                  <div class="app-icon">
                    <img :src="item.icon" :alt="item.name" />
                  </div>
                  <div class="app-info">
                    <div class="app-item-title">{{ item.name }} <i class="fa-solid fa-arrow-up-right-from-square"></i>
                    </div>
                    <div class="app-item desc">{{ item.desc }}</div>
                  </div>
                </li>
              </ul>
            </div>
          </div>

        </div>
      </el-col>
    </el-row>

  </div>
</template>

<script setup>

const directContent = ref([
  { id: '1', icon: 'fa-brands fa-slack', name: '智能鉴黄', desc: '识别文本中的色情行为描述、色情资源链接、低俗交友、污秽文爱等涉黄内容' },
  { id: '2', icon: 'fa-solid fa-list-check', name: '违禁违规', desc: '识别暴力行为、恐怖描述、赌博、毒品、枪支弹药等违禁文字内容' },
  { id: '3', icon: 'fa-solid fa-at', name: '恶意推广', desc: '识别带有售卖意向的软文广告、微信/QQ/联系方式等违规广告，支持包含符号、图标等变异广告' },
  { id: '4', icon: 'fa-solid fa-list-check', name: '低俗辱骂', desc: '识别文本中的侮辱谩骂、人身攻击、消极宣泄等不良内容' },
  { id: '5', icon: 'fa-solid fa-file-word', name: '低质灌水', desc: '识别网络社区常见的乱码、水帖、刷屏等无意义的灌水信息' },
]);


const apps = ref([
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/051de32597041e41f73b97d61c67a13b-9cbdaf85e3bcf29b656fdedd8e6d1305.svg', name: '构建 Web 应用程序', desc: 'With Route 53 (3 分钟)' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg', name: '部署无服务器微服务', desc: 'With Route 53 (3 分钟)' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/7177e919b32ad97825f95e902595014b-1594766d92813b5baeb706c453f91de0.svg', name: '使用虚拟服务器构建', desc: 'With Route 53 (3 分钟)' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg', name: '开始迁移到 AIP', desc: 'With Route 53 (3 分钟)' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/9da5a168cf8194c8ee5ed192a443d563-674375b53bc8ae94f48cfdb5c81e8363.svg', name: '托管静态 Web 应用程序', desc: 'With Route 53 (3 分钟)' },
]);

</script>
