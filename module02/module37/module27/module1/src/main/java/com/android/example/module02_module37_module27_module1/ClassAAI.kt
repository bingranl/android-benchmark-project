package com.android.example.module02_module37_module27_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module02_module37_module27_module3.ClassAAB = com.android.example.module02_module37_module27_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module02_module37_module27_module3.ClassAAF = com.android.example.module02_module37_module27_module3.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module02_module37_module27_module3.ClassAAE = com.android.example.module02_module37_module27_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module02_module37_module27_module3.ClassAAE
	) {
		listOf("1", "2", "3").forEach {
			param0.method3("SomeString", "SomeString")

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
		val local_var_2_1: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_1.clear()

		param0.method4("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module02_module37_module27_module3.ClassAAI
	) {
	}

	fun method2(
		param0: com.android.example.module02_module37_module27_module3.ClassAAI,
		param1: com.android.example.module02_module37_module27_module3.ClassAAD
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_3.offer(kotlin.Any(), kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method3(
		param0: com.android.example.module02_module37_module27_module3.ClassAAH,
		param1: com.android.example.module02_module37_module27_module3.ClassAAD,
		param2: com.android.example.module02_module37_module27_module3.ClassAAH
	) {
		val local_var_2_3: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_3.offer(kotlin.Any())

		param0.method4("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.triggerActions()

	}

	fun method4(
		param0: com.android.example.module02_module37_module27_module3.ClassAAB,
		param1: com.android.example.module02_module37_module27_module3.ClassAAJ
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

	}
}
