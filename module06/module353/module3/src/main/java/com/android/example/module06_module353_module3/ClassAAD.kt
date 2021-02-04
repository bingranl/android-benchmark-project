package com.android.example.module06_module353_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: com.android.example.module06_module353_module2.ClassAAB = com.android.example.module06_module353_module2.ClassAAB()

	fun method0(
		param0: rx.internal.util.unsafe.SpscUnboundedArrayQueue<kotlin.Any>,
		param1: com.android.example.module06_module353_module2.ClassAAF,
		param2: com.android.example.module06_module353_module2.ClassAAF,
		param3: com.android.example.module06_module353_module2.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-5447040884174972019)

		val local_var_2_5: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()
		local_var_2_5.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.assertSubscribed()

		val local_var_2_7: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
		local_var_2_7.method3("SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAJ,
		param1: com.android.example.module06_module353_module2.ClassAAJ,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: com.android.example.module06_module353_module2.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

		val local_var_2_6: rx.internal.util.atomic.MpscLinkedAtomicQueue<kotlin.Any> = rx.internal.util.atomic.MpscLinkedAtomicQueue()
		local_var_2_6.poll()

		param0.method1("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAJ
	) {
	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAB,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: com.android.example.module06_module353_module2.ClassAAB
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		param0.method1("SomeString", "SomeString")

	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.disposables.SerialDisposable
	) {
		param0.request(-8466359285556496424)

	}
}
