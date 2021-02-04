package com.android.example.module02_module37_module27_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module02_module37_module27_module3.ClassAAH = com.android.example.module02_module37_module27_module3.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module02_module37_module27_module1.ClassAAE = com.android.example.module02_module37_module27_module1.ClassAAE()

	fun method0(
		param0: com.android.example.module02_module37_module27_module3.ClassAAA,
		param1: com.android.example.module02_module37_module27_module1.ClassAAB,
		param2: com.android.example.module02_module37_module27_module1.ClassAAB,
		param3: com.android.example.module02_module37_module27_module1.ClassAAB
	) {
		for (iAb in 0..4) {
			for (iAc in 0..5) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.isDisposed()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.assertNotSubscribed()

				val local_var_4_2: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
				local_var_4_2.offer(kotlin.Any())

				local_var_4_0.isDisposed()

			}
			param0.method2("SomeString", "SomeString")

			param0.method1("SomeString", "SomeString", "SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module02_module37_module27_module1.ClassAAJ,
		param1: com.android.example.module02_module37_module27_module1.ClassAAF,
		param2: com.android.example.module02_module37_module27_module1.ClassAAB
	) {
		param0.method0(com.android.example.module02_module37_module27_module3.ClassAAA(), com.android.example.module02_module37_module27_module3.ClassAAI(), com.android.example.module02_module37_module27_module3.ClassAAE())

		val local_var_2_3: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_3.offer(kotlin.Any())

	}

	fun method2(
		param0: com.android.example.module02_module37_module27_module3.ClassAAF,
		param1: com.android.example.module02_module37_module27_module1.ClassAAF,
		param2: com.android.example.module02_module37_module27_module1.ClassAAA,
		param3: com.android.example.module02_module37_module27_module3.ClassAAH
	) {
		val local_var_2_4: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_4.isEmpty()

		param0.method2("SomeString", "SomeString")

		val local_var_2_5: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_5.poll()

	}
}
