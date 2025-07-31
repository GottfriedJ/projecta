file '/home/vagrant/hello.txt' do
  content "Hello from Chef Solo!\n"
  owner 'vagrant'
  group 'vagrant'
  mode '0644'
end
